package builder.chessPiece;

public class TestChessPieceBuilder {

    public static void main(String[] args) {

        ChessPiece piece1W = ChessPiece.builder()
                .name("Knight")
                .color("white")
                .value(3)
                .square("f3")
                .build();
        ChessPiece piece2W = ChessPiece.builder()
                .name("King")
                .color("white")
                .square("g1")
                .build();
        ChessPiece piece3W = ChessPiece.builder()
                .name("Pawn")
                .color("white")
                .square("h2")
                .value(1)
                .build();
        ChessPiece piece1B = ChessPiece.builder()
                .name("Bishop")
                .color("black")
                .value(3.2)
                .square("g7")
                .build();
        ChessPiece piece2B = ChessPiece.builder()
                .name("King")
                .color("black")
                .square("g8")
                .build();

        System.out.println("POSICION DE LA PARTIDA");
        System.out.println(piece1W.getName() + " " + piece1W.getColor() + " in square " + piece1W.getSquare());
        System.out.println(piece2W.getName() + " " + piece2W.getColor() + " in square " + piece2W.getSquare());
        System.out.println(piece3W.getName() + " " + piece3W.getColor() + " in square " + piece3W.getSquare());
        System.out.println(piece1B.getName() + " " + piece1B.getColor() + " in square " + piece1B.getSquare());
        System.out.println(piece2B.getName() + " " + piece2B.getColor() + " in square " + piece2B.getSquare());

        System.out.println("VALORACION DE LA POSICION");

        double totalWhite = piece1W.getValue() + piece2W.getValue() + piece3W.getValue();
        double totalBlack = piece1B.getValue() + piece2B.getValue();

        if (totalWhite == totalBlack)
            System.out.println("la partida está equilibrada");
        if (totalWhite > totalBlack)
            System.out.println("Las blancas tienen ventaja material igual a " + String.format("%.2f", totalWhite - totalBlack) + " punto/s");
        if (totalWhite < totalBlack)
            System.out.println("Las negras tienen ventaja material igual a " + String.format("%.2f", totalBlack - totalWhite) + " punto/s");
    }





}
