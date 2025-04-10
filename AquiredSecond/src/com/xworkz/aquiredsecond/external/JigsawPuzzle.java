package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Puzzle;

public class JigsawPuzzle extends Puzzle {
    public JigsawPuzzle() {
        super();
        System.out.println("no-arg const of jigsawPuzzle");
    }

    @Override
    public void solve() {
        System.out.println("running solve in jigsawPuzzle");
    }

    public void fitPieces() {
        System.out.println("running fitPieces in jigsawPuzzle");
    }
}
