package com.epam.glava_3;

public class Multiplicator {
    public Matrix multiply(Matrix p, Matrix q) throws MatrixException {
        int v = p.getVerticalSize();
        int h = q.getHorizontalSize();
        int consoleSize = p.getHorizontalSize();

        if (consoleSize != q.getVerticalSize()) {
            throw new MatrixException("incompatible matrices");
        }
        Matrix result = new Matrix(v, h);
        try {
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < h; j++) {
                    int value = 0;
                    for (int k = 0; k < consoleSize; k++) {
                        value += p.getElement(i ,k) * q.getElement(k, j);
                    }
                    result.setElement(i, j, value);
                }
            }
        } catch (MatrixException e) {
        }
        return  result;
    }
}
