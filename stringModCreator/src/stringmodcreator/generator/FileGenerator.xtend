package stringmodcreator.generator

class FileGenerator {
	def static void generateFile(String fullname, String path, String content){
		println(
			'''
			---------------------NEW FILE---------------------
			File:   «fullname» 
			At:     «path»
			Content:
			«"\t" + content.replace("\n", "\n\t")»
			---------------------FILE END---------------------
			'''
		)
	}
}