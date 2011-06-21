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

package org.modeshape.connector.cmis;

import org.modeshape.graph.ExecutionContext;
import org.modeshape.graph.observe.Observer;
import org.modeshape.graph.request.CloneBranchRequest;
import org.modeshape.graph.request.CloneWorkspaceRequest;
import org.modeshape.graph.request.CopyBranchRequest;
import org.modeshape.graph.request.CreateNodeRequest;
import org.modeshape.graph.request.CreateWorkspaceRequest;
import org.modeshape.graph.request.DeleteBranchRequest;
import org.modeshape.graph.request.DestroyWorkspaceRequest;
import org.modeshape.graph.request.GetWorkspacesRequest;
import org.modeshape.graph.request.MoveBranchRequest;
import org.modeshape.graph.request.ReadAllChildrenRequest;
import org.modeshape.graph.request.ReadAllPropertiesRequest;
import org.modeshape.graph.request.UpdatePropertiesRequest;
import org.modeshape.graph.request.VerifyWorkspaceRequest;
import org.modeshape.graph.request.processor.RequestProcessor;

public class CmisRequestProcessor extends RequestProcessor {

    public CmisRequestProcessor( String sourceName,
                                 ExecutionContext context,
                                 Observer observer ) {
        super(sourceName, context, observer);
    }

    @Override
    public void process( VerifyWorkspaceRequest request ) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void process( GetWorkspacesRequest request ) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void process( CreateWorkspaceRequest request ) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void process( CloneBranchRequest request ) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void process( CloneWorkspaceRequest request ) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void process( DestroyWorkspaceRequest request ) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void process( CopyBranchRequest request ) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void process( CreateNodeRequest request ) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void process( DeleteBranchRequest request ) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void process( MoveBranchRequest request ) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void process( ReadAllChildrenRequest request ) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void process( ReadAllPropertiesRequest request ) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void process( UpdatePropertiesRequest request ) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
