package com.example.decorator.model;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author wll
 * @data 2020/06/04
 */
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
//        return (c == -1 ? c : Character.toLowerCase((char) c));
        return (c == -1 ? c : Character.toUpperCase((char) c));
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }

        return result;
    }
}
