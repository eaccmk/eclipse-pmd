// =====================================================================
//
// Copyright (C) 2012, Philip Graf
//
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
//
// =====================================================================

package ch.acanda.eclipse.pmd.domain;

import java.nio.file.Path;

/**
 * A rule set configuration stored in the file system.
 * 
 * @author Philip Graf
 */
public class FileSystemRuleSetConfiguration extends RuleSetConfiguration {
    
    private final Path configuration;
    
    public FileSystemRuleSetConfiguration(final int id, final String name, final Path configuration) {
        super(id, name);
        this.configuration = configuration.toAbsolutePath().normalize();
    }
    
    @Override
    public String getType() {
        return "File System";
    }
    
    @Override
    public String getLocation() {
        return configuration.toString();
    }
    
    @Override
    public Path getConfiguration() {
        return configuration;
    }
    
}
