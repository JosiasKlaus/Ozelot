package ozelot.generator

import org.eclipse.core.resources.IProject
import ozelot.Mod
import java.nio.file.Paths

class ForgeSetup {	
	def static void run(IProject project, Mod mod){
		FileGenerator.generateFile(project, "gradle-wrapper.properties", FolderGenerator.getBaseFolder(mod) + '/gradle/wrapper/', getGradleWrapper, true)
		FileGenerator.generateFile(project, "build.gradle", FolderGenerator.getBaseFolder(mod), getBuildGradle(mod), true)
		FileGenerator.generateFile(project, "gradle.properties", FolderGenerator.getBaseFolder(mod), gradleProperties, true)		
		FileGenerator.generateFile(project, "gradlew", FolderGenerator.getBaseFolder(mod), gradlew, true)		
		FileGenerator.generateFile(project, "gradlew.bat", FolderGenerator.getBaseFolder(mod), gradlewBat, true)
		
		FileGenerator.copy(project, mod, mod.projectPath + '\\res\\gradle-wrapper.jar', FolderGenerator.getBaseFolder(mod) + '/gradle/wrapper')		
	}
	
	def private static String getGradleWrapper(){
		'''
		distributionBase=GRADLE_USER_HOME
		distributionPath=wrapper/dists
		distributionUrl=https\://services.gradle.org/distributions/gradle-7.5.1-bin.zip
		zipStoreBase=GRADLE_USER_HOME
		zipStorePath=wrapper/dists
		'''
	}
	
	def private static String getBuildGradle(Mod mod){
		'''
		buildscript {
		    repositories {
		        maven { url = 'https://maven.minecraftforge.net' }
		        mavenCentral()
		    }
		    dependencies {
		        classpath group: 'net.minecraftforge.gradle', name: 'ForgeGradle', version: '5.1.+', changing: true
		    }
		}
		
		
		plugins {
		    id 'eclipse'
		    id 'maven-publish'
		}
		apply plugin: 'net.minecraftforge.gradle'
		
		
		group = '«FolderGenerator.getOzelotPackage()»'
		version = '«mod.version»'
		
		java {
		    archivesBaseName = '«mod.modId»'
		    toolchain.languageVersion = JavaLanguageVersion.of(17)
		}
		
		println "Java: ${System.getProperty 'java.version'}, JVM: ${System.getProperty 'java.vm.version'} (${System.getProperty 'java.vendor'}), Arch: ${System.getProperty 'os.arch'}"
		
		minecraft {
		    mappings channel: 'official', version: '1.18.2'
		
		    runs {
		        client {
		            workingDirectory project.file('run')
		            property 'forge.logging.markers', 'REGISTRIES'
		            property 'forge.logging.console.level', 'debug'
		            property 'forge.enabledGameTestNamespaces', '«mod.modId»'
		            mods {
		                «mod.modId» {
		                    source sourceSets.main
		                }
		            }
		        }
		
		        server {
		            workingDirectory project.file('run')
		            property 'forge.logging.markers', 'REGISTRIES'
		            property 'forge.logging.console.level', 'debug'
		            property 'forge.enabledGameTestNamespaces', '«mod.modId»'
		            mods {
		                «mod.modId» {
		                    source sourceSets.main
		                }
		            }
		        }
		
		        gameTestServer {
		            workingDirectory project.file('run')
		            property 'forge.logging.markers', 'REGISTRIES'
		            property 'forge.logging.console.level', 'debug'
		            property 'forge.enabledGameTestNamespaces', '«mod.modId»'
		            mods {
		                «mod.modId» {
		                    source sourceSets.main
		                }
		            }
		        }
		
		        data {
		            workingDirectory project.file('run')
		            property 'forge.logging.markers', 'REGISTRIES'
		            property 'forge.logging.console.level', 'debug'
		            args '--mod', '«mod.modId»', '--all', '--output', file('src/generated/resources/'), '--existing', file('src/main/resources/')
		            mods {
		                «mod.modId» {
		                    source sourceSets.main
		                }
		            }
		        }
		    }
		}
		
		sourceSets.main.resources { srcDir 'src/generated/resources' }
		
		repositories {
		    // flatDir {
		    //     dir 'libs'
		    // }
		}
		
		dependencies {
		    minecraft 'net.minecraftforge:forge:1.18.2-40.2.9'
		}
		
		jar {
		    manifest {
		        attributes([
		                "Specification-Title"     : "«mod.modId»",
		                "Specification-Vendor"    : "«mod.modId»sareus",
		                "Specification-Version"   : "1", 
		                "Implementation-Title"    : project.name,
		                "Implementation-Version"  : project.jar.archiveVersion,
		                "Implementation-Vendor"   : "«mod.modId»sareus",
		                "Implementation-Timestamp": new Date().format("yyyy-MM-dd'T'HH:mm:ssZ")
		        ])
		    }
		}
		
		jar.finalizedBy('reobfJar')
		
		publishing {
		    publications {
		        mavenJava(MavenPublication) {
		            artifact jar
		        }
		    }
		    repositories {
		        maven {
		            url "file://${project.projectDir}/mcmodsrepo"
		        }
		    }
		}
		
		tasks.withType(JavaCompile).configureEach {
		    options.encoding = 'UTF-8' 
		}
		'''
	}
	
	def private static String getGradleProperties(){
		'''
		# Sets default memory used for gradle commands. Can be overridden by user or command line properties.
		# This is required to provide enough memory for the Minecraft decompilation process.
		org.gradle.jvmargs=-Xmx3G
		org.gradle.daemon=false
		'''
	}
	
	def private static String getGradlew(){
		return '''
		#!/bin/sh
		
		#
		# Copyright © 2015-2021 the original authors.
		#
		# Licensed under the Apache License, Version 2.0 (the "License");
		# you may not use this file except in compliance with the License.
		# You may obtain a copy of the License at
		#
		#      https://www.apache.org/licenses/LICENSE-2.0
		#
		# Unless required by applicable law or agreed to in writing, software
		# distributed under the License is distributed on an "AS IS" BASIS,
		# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		# See the License for the specific language governing permissions and
		# limitations under the License.
		#
		
		##############################################################################
		#
		#   Gradle start up script for POSIX generated by Gradle.
		#
		#   Important for running:
		#
		#   (1) You need a POSIX-compliant shell to run this script. If your /bin/sh is
		#       noncompliant, but you have some other compliant shell such as ksh or
		#       bash, then to run this script, type that shell name before the whole
		#       command line, like:
		#
		#           ksh Gradle
		#
		#       Busybox and similar reduced shells will NOT work, because this script
		#       requires all of these POSIX shell features:
		#         * functions;
		#         * expansions «'«'»$var«'»'», «'«'»${var}«'»'», «'«'»${var:-default}«'»'», «'«'»${var+SET}«'»'»,
		#           «'«'»${var#prefix}«'»'», «'«'»${var%suffix}«'»'», and «'«'»$( cmd )«'»'»;
		#         * compound commands having a testable exit status, especially «'«'»case«'»'»;
		#         * various built-in commands including «'«'»command«'»'», «'«'»set«'»'», and «'«'»ulimit«'»'».
		#
		#   Important for patching:
		#
		#   (2) This script targets any POSIX shell, so it avoids extensions provided
		#       by Bash, Ksh, etc; in particular arrays are avoided.
		#
		#       The "traditional" practice of packing multiple parameters into a
		#       space-separated string is a well documented source of bugs and security
		#       problems, so this is (mostly) avoided, by progressively accumulating
		#       options in "$@", and eventually passing that to Java.
		#
		#       Where the inherited environment variables (DEFAULT_JVM_OPTS, JAVA_OPTS,
		#       and GRADLE_OPTS) rely on word-splitting, this is performed explicitly;
		#       see the in-line comments for details.
		#
		#       There are tweaks for specific operating systems such as AIX, CygWin,
		#       Darwin, MinGW, and NonStop.
		#
		#   (3) This script is generated from the Groovy template
		#       https://github.com/gradle/gradle/blob/master/subprojects/plugins/src/main/resources/org/gradle/api/internal/plugins/unixStartScript.txt
		#       within the Gradle project.
		#
		#       You can find Gradle at https://github.com/gradle/gradle/.
		#
		##############################################################################
		
		# Attempt to set APP_HOME
		
		# Resolve links: $0 may be a link
		app_path=$0
		
		# Need this for daisy-chained symlinks.
		while
		    APP_HOME=${app_path%"${app_path##*/}"}  # leaves a trailing /; empty if no leading path
		    [ -h "$app_path" ]
		do
		    ls=$( ls -ld "$app_path" )
		    link=${ls#*' -> '}
		    case $link in             #(
		      /*)   app_path=$link ;; #(
		      *)    app_path=$APP_HOME$link ;;
		    esac
		done
		
		APP_HOME=$( cd "${APP_HOME:-./}" && pwd -P ) || exit
		
		APP_NAME="Gradle"
		APP_BASE_NAME=${0##*/}
		
		# Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
		DEFAULT_JVM_OPTS='"-Xmx64m" "-Xms64m"'
		
		# Use the maximum available, or set MAX_FD != -1 to use that value.
		MAX_FD=maximum
		
		warn () {
		    echo "$*"
		} >&2
		
		die () {
		    echo
		    echo "$*"
		    echo
		    exit 1
		} >&2
		
		# OS specific support (must be 'true' or 'false').
		cygwin=false
		msys=false
		darwin=false
		nonstop=false
		case "$( uname )" in                #(
		  CYGWIN* )         cygwin=true  ;; #(
		  Darwin* )         darwin=true  ;; #(
		  MSYS* | MINGW* )  msys=true    ;; #(
		  NONSTOP* )        nonstop=true ;;
		esac
		
		CLASSPATH=$APP_HOME/gradle/wrapper/gradle-wrapper.jar
		
		
		# Determine the Java command to use to start the JVM.
		if [ -n "$JAVA_HOME" ] ; then
		    if [ -x "$JAVA_HOME/jre/sh/java" ] ; then
		        # IBM's JDK on AIX uses strange locations for the executables
		        JAVACMD=$JAVA_HOME/jre/sh/java
		    else
		        JAVACMD=$JAVA_HOME/bin/java
		    fi
		    if [ ! -x "$JAVACMD" ] ; then
		        die "ERROR: JAVA_HOME is set to an invalid directory: $JAVA_HOME
		
		Please set the JAVA_HOME variable in your environment to match the
		location of your Java installation."
		    fi
		else
		    JAVACMD=java
		    which java >/dev/null 2>&1 || die "ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
		
		Please set the JAVA_HOME variable in your environment to match the
		location of your Java installation."
		fi
		
		# Increase the maximum file descriptors if we can.
		if ! "$cygwin" && ! "$darwin" && ! "$nonstop" ; then
		    case $MAX_FD in #(
		      max*)
		        MAX_FD=$( ulimit -H -n ) ||
		            warn "Could not query maximum file descriptor limit"
		    esac
		    case $MAX_FD in  #(
		      '' | soft) :;; #(
		      *)
		        ulimit -n "$MAX_FD" ||
		            warn "Could not set maximum file descriptor limit to $MAX_FD"
		    esac
		fi
		
		# Collect all arguments for the java command, stacking in reverse order:
		#   * args from the command line
		#   * the main class name
		#   * -classpath
		#   * -D...appname settings
		#   * --module-path (only if needed)
		#   * DEFAULT_JVM_OPTS, JAVA_OPTS, and GRADLE_OPTS environment variables.
		
		# For Cygwin or MSYS, switch paths to Windows format before running java
		if "$cygwin" || "$msys" ; then
		    APP_HOME=$( cygpath --path --mixed "$APP_HOME" )
		    CLASSPATH=$( cygpath --path --mixed "$CLASSPATH" )
		
		    JAVACMD=$( cygpath --unix "$JAVACMD" )
		
		    # Now convert the arguments - kludge to limit ourselves to /bin/sh
		    for arg do
		        if
		            case $arg in                                #(
		              -*)   false ;;                            # don't mess with options #(
		              /?*)  t=${arg#/} t=/${t%%/*}              # looks like a POSIX filepath
		                    [ -e "$t" ] ;;                      #(
		              *)    false ;;
		            esac
		        then
		            arg=$( cygpath --path --ignore --mixed "$arg" )
		        fi
		        # Roll the args list around exactly as many times as the number of
		        # args, so each arg winds up back in the position where it started, but
		        # possibly modified.
		        #
		        # NB: a `for` loop captures its iteration list before it begins, so
		        # changing the positional parameters here affects neither the number of
		        # iterations, nor the values presented in `arg`.
		        shift                   # remove old arg
		        set -- "$@" "$arg"      # push replacement arg
		    done
		fi
		
		# Collect all arguments for the java command;
		#   * $DEFAULT_JVM_OPTS, $JAVA_OPTS, and $GRADLE_OPTS can contain fragments of
		#     shell script including quotes and variable substitutions, so put them in
		#     double quotes to make sure that they get re-expanded; and
		#   * put everything else in single quotes, so that it's not re-expanded.
		
		set -- \
		        "-Dorg.gradle.appname=$APP_BASE_NAME" \
		        -classpath "$CLASSPATH" \
		        org.gradle.wrapper.GradleWrapperMain \
		        "$@"
		
		# Use "xargs" to parse quoted args.
		#
		# With -n1 it outputs one arg per line, with the quotes and backslashes removed.
		#
		# In Bash we could simply go:
		#
		#   readarray ARGS < <( xargs -n1 <<<"$var" ) &&
		#   set -- "${ARGS[@]}" "$@"
		#
		# but POSIX shell has neither arrays nor command substitution, so instead we
		# post-process each arg (as a line of input to sed) to backslash-escape any
		# character that might be a shell metacharacter, then use eval to reverse
		# that process (while maintaining the separation between arguments), and wrap
		# the whole thing up as a single "set" statement.
		#
		# This will of course break if any of these variables contains a newline or
		# an unmatched quote.
		#
		
		eval "set -- $(
		        printf '%s\n' "$DEFAULT_JVM_OPTS $JAVA_OPTS $GRADLE_OPTS" |
		        xargs -n1 |
		        sed ' s~[^-[:alnum:]+,./:=@_]~\\&~g; ' |
		        tr '\n' ' '
		    )" '"$@"'
		
		exec "$JAVACMD" "$@"
		'''
	}
	
	def private static String getGradlewBat(){
		'''
		@rem
		@rem Copyright 2015 the original author or authors.
		@rem
		@rem Licensed under the Apache License, Version 2.0 (the "License");
		@rem you may not use this file except in compliance with the License.
		@rem You may obtain a copy of the License at
		@rem
		@rem      https://www.apache.org/licenses/LICENSE-2.0
		@rem
		@rem Unless required by applicable law or agreed to in writing, software
		@rem distributed under the License is distributed on an "AS IS" BASIS,
		@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		@rem See the License for the specific language governing permissions and
		@rem limitations under the License.
		@rem
		
		@if "%DEBUG%" == "" @echo off
		@rem ##########################################################################
		@rem
		@rem  Gradle startup script for Windows
		@rem
		@rem ##########################################################################
		
		@rem Set local scope for the variables with windows NT shell
		if "%OS%"=="Windows_NT" setlocal
		
		set DIRNAME=%~dp0
		if "%DIRNAME%" == "" set DIRNAME=.
		set APP_BASE_NAME=%~n0
		set APP_HOME=%DIRNAME%
		
		@rem Resolve any "." and ".." in APP_HOME to make it shorter.
		for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi
		
		@rem Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
		set DEFAULT_JVM_OPTS="-Xmx64m" "-Xms64m"
		
		@rem Find java.exe
		if defined JAVA_HOME goto findJavaFromJavaHome
		
		set JAVA_EXE=java.exe
		%JAVA_EXE% -version >NUL 2>&1
		if "%ERRORLEVEL%" == "0" goto execute
		
		echo.
		echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
		echo.
		echo Please set the JAVA_HOME variable in your environment to match the
		echo location of your Java installation.
		
		goto fail
		
		:findJavaFromJavaHome
		set JAVA_HOME=%JAVA_HOME:"=%
		set JAVA_EXE=%JAVA_HOME%/bin/java.exe
		
		if exist "%JAVA_EXE%" goto execute
		
		echo.
		echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
		echo.
		echo Please set the JAVA_HOME variable in your environment to match the
		echo location of your Java installation.
		
		goto fail
		
		:execute
		@rem Setup the command line
		
		set CLASSPATH=%APP_HOME%\gradle\wrapper\gradle-wrapper.jar
		
		
		@rem Execute Gradle
		"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %GRADLE_OPTS% "-Dorg.gradle.appname=%APP_BASE_NAME%" -classpath "%CLASSPATH%" org.gradle.wrapper.GradleWrapperMain %*
		
		:end
		@rem End local scope for the variables with windows NT shell
		if "%ERRORLEVEL%"=="0" goto mainEnd
		
		:fail
		rem Set variable GRADLE_EXIT_CONSOLE if you need the _script_ return code instead of
		rem the _cmd.exe /c_ return code!
		if  not "" == "%GRADLE_EXIT_CONSOLE%" exit 1
		exit /b 1
		
		:mainEnd
		if "%OS%"=="Windows_NT" endlocal
		
		:omega
		'''
	}
	
}