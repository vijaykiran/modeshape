/*
 * ModeShape (http://www.modeshape.org)
 * See the COPYRIGHT.txt file distributed with this work for information
 * regarding copyright ownership.  Some portions may be licensed
 * to Red Hat, Inc. under one or more contributor license agreements.
 * See the AUTHORS.txt file in the distribution for a full listing of 
 * individual contributors.
 *
 * ModeShape is free software. Unless otherwise indicated, all code in ModeShape
 * is licensed to you under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 * 
 * ModeShape is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.modeshape.sequencer.ddl.dialect.db2;

import java.util.Arrays;
import java.util.List;

import org.modeshape.sequencer.ddl.DdlConstants;

/**
 * @author blafond
 *
 */
public interface Db2DdlConstants extends DdlConstants {
	public static final String[] CUSTOM_KEYWORDS = {
		
	};

	interface Db2StatementStartPhrases {
	    static final String[][] ALTER_PHRASES = { 
		};
	    
	    static final String[][] CREATE_PHRASES = { 
	    	
		};
	    static final
	    String[][] DROP_PHRASES = { 
		};
	    static final String[][] SET_PHRASES = { 
	
		};	    
	    static final String[][] MISC_PHRASES = { 
		};
	}
	
	interface Db2DataTypes {
		static final List<String[]> CUSTOM_DATATYPE_START_PHRASES = 
	  		Arrays.asList(new String[][] {
	  	  	});
		
	  	static final List<String> CUSTOM_DATATYPE_START_WORDS = 
	  		Arrays.asList(new String[] {
	  	  	});
	}
}
