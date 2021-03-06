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
/**
 * A set of utilities for working with text.  Included is an {@link org.modeshape.common.text.Inflector} class that transforms (English) works into singular,
 * plural, and human-readable forms, and is capable of transforming between camel-case, whitespace-delimited, or underscore-delimited
 * forms.  There is also components that can {@link org.modeshape.common.text.TextEncoder encode} and {@link org.modeshape.common.text.TextDecoder decode} text.
 * Finally, this package defines a simple framework for {@link org.modeshape.common.text.TokenStream tokenizing text} (e.g., from files or stream)
 * making it very easy to create very straightforward parsers.
 */

package org.modeshape.common.text;

