package org.apache.hadoop.fs.swift.snative;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.DelegateToFileSystem;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * TODO add API doc
 *
 * @author Martin Boettcher
 */
public class SwiftAbstractFileSystem extends DelegateToFileSystem {
    public SwiftAbstractFileSystem(URI theUri, Configuration conf)
            throws IOException, URISyntaxException {
        super(theUri, new SwiftNativeFileSystem(), conf, "swift", false);
    }
}
