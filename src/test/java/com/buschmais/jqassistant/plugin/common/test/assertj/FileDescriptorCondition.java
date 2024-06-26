package com.buschmais.jqassistant.plugin.common.test.assertj;

import com.buschmais.jqassistant.plugin.common.api.model.FileDescriptor;

import org.assertj.core.api.Condition;

/**
 * A {@link Condition} for asserting a {@link FileDescriptor} by its name.
 */
public class FileDescriptorCondition extends Condition<FileDescriptor> {

    private final String expectedFileName;

    private FileDescriptorCondition(String expectedFileName) {
        super("file '" + expectedFileName + "'");
        this.expectedFileName = expectedFileName;
    }

    @Override
    public boolean matches(FileDescriptor value) {
        return value.getFileName()
            .equals(expectedFileName);
    }

    public static FileDescriptorCondition fileDescriptor(String expectedFileName) {
        return new FileDescriptorCondition(expectedFileName);
    }
}
