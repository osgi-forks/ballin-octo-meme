/**
 * Copyright (C) 2013 Oliver Schünemann
 * 
 * This program is free software; you can redistribute it and/or modify it under the terms of the 
 * GNU General Public License as published by the Free Software Foundation; either version 2 of 
 * the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * See the GNU General Public License for more details. 
 * 
 * You should have received a copy of the GNU General Public License along with this program; 
 * if not, write to the Free Software Foundation, Inc., 51 Franklin St, Fifth Floor, 
 * Boston, MA 02110, USA 
 * 
 * @since 11.10.2013
 * @version 1.0
 * @author oliver
 */
package pb.web.gwt.server.impl;

import org.apache.felix.scr.annotations.Component;

import pb.logging.BaseLog;

/**
 * This brings the logging to us
 * 
 * @author oliver
 */
@Component(name = "pb.web.gwt.log", immediate = true, label = "pb.web.gwt.log")
public class Log extends BaseLog {

}
