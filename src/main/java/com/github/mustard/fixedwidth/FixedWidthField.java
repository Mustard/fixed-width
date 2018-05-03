package com.github.mustard.fixedwidth;

public class FixedWidthField {

    public final int offset;
    public final int length;

    public FixedWidthField(FixedWidthFieldBuilder builder) {
        this.offset = builder.offset;
        this.length = builder.length;
    }

    public static FixedWidthFieldBuilder length(int length) {
        return new FixedWidthFieldBuilder(length);
    }

    public static class FixedWidthFieldBuilder {

        private int offset;
        private int length;

        public FixedWidthFieldBuilder(int length) {
            this.length = length;
        }

    }

}
