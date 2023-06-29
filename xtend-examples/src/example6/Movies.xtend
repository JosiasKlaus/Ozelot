/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Author - Sven Efftinge
 *******************************************************************************/
package example6

import java.io.FileReader
import java.util.Set
import org.eclipse.xtend.lib.annotations.Data
import org.junit.Test

import static org.junit.Assert.*

import static extension com.google.common.io.CharStreams.*

class Movies {
	
	/**
	 * @return the total number of action movies
	 */ 
	@Test def void numberOfActionMovies() {
		assertEquals(828, movies.filter[categories.contains('Action')].size)
	}
	
	/**
	 * @return the year the best rated movie of 80ies (1980-1989) was released.
	 */
	@Test def void yearOfBestMovieFrom80ies() {
		assertEquals(1989, movies.filter[(1980..1989).contains(year)].maxBy[rating].year)
	}
	
	/**
	 * @return the sum of the number of votes of the two top rated movies.
	 */
	@Test def void sumOfVotesOfTop2() {
		val long movies = movies.sortBy[-rating].take(2).map[numberOfVotes].reduce[a, b| a + b]
		assertEquals(47_229, movies)
	}
	
	val movies = new FileReader('data.csv').readLines.map[ line |
		val segments = line.split('  ').iterator
		return new Movie(
			segments.next, 
			Integer.parseInt(segments.next), 
			Double.parseDouble(segments.next), 
			Long.parseLong(segments.next), 
			segments.toSet
		)
	]
}

@Data class Movie {
	String title
	int year
	double rating
	long numberOfVotes
	Set<String> categories 
}