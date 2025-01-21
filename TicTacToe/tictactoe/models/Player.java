package scaler.lld3.tictactoe.models;

import javax.swing.*;
import java.util.Scanner;

public class Player {
    private Long id;
    private String name;
    private Symbol symbol;
    private PlayerType type;
    private Scanner scanner;

    public Player(Long id, String name, Symbol symbol, PlayerType type) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.type = type;
        scanner = new Scanner(System.in);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public PlayerType getType() {
        return type;
    }

    public Move makeMove(Board board) {
        System.out.println("Please tell the row index where you want to make a move (Starting from 0): ");
        int row = scanner.nextInt();

        System.out.println("Please tell the column index where you want to make a move (Starting from 0): ");
        int col = scanner.nextInt();

        return new Move(new Cell(row, col), this);
    }
}
