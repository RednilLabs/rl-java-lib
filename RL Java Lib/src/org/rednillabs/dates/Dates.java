/*	-----------------------------------------------------------------

    Copyright 2014 RednilLabs.org.


    This file is part of RL Java Lib.

    RL Java Lib is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    RL Java Lib is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Foobar.  If not, see <http://www.gnu.org/licenses/>.

	-----------------------------------------------------------------
*/
package org.rednillabs.dates;

/**
 * Methods for manipulating Dates.
 * @author RednilLabs.org
 *
 */
public class Dates {
	
	/**
	 * Takes a java.util.Date value and returns a java.sql.Date value.
	 * @param utilDate
	 * @return java.sql.Date
	 */
	public java.sql.Date getSqlDateFromUtilDate(java.util.Date utilDate){
		
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		return sqlDate;
	}
	
	
	
	
}
