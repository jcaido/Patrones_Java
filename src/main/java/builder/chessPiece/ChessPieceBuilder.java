package builder.chessPiece;

public class ChessPieceBuilder {

    private String name;
    private String color;
    private String square;
    private double value;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getValue() {
        return value;
    }

    public String getSquare() {
        return square;
    }

    public ChessPieceBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ChessPieceBuilder color(String color) {
        this.color = color;
        return this;
    }

    public ChessPieceBuilder value(double value) {
        this.value = value;
        return this;
    }

    public ChessPieceBuilder square(String square) {
        this.square = square;
        return this;
    }

    public ChessPiece build() {
        ChessPiece piece = new ChessPiece();
        piece.setName(this.getName());
        piece.setColor(this.getColor());
        piece.setValue(this.getValue());
        piece.setSquare(this.getSquare());

        return piece;
    }
}
