package Bitlab.Module2.Practice2;

public class Task7_8_9_10_11_12 {
    public static void main(String[] args) {
        Player player = new Player();
        player.number = 23;
        player.name = "Ferland";
        player.surname = "Mendy";
        player.position = "defender";

        System.out.println(player);
    }
}

class Player {
    int number;
    String name;
    String surname;
    String position;

    public Player() {
        number = 0;
        name = "N/A";
        surname = "N/A";
        position = "N/A";
    }

    public Player(int number, String name, String surname, String position) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public String toString() {
        return ("Player{number=" + number + ", name='" + name + "', surname='" + surname + "', position='" + position + "'}");
    }
}

class Club {
    String name;
    String country;
    int ratingPoints;
    Player[] players;

    Club() {
        name = null;
        country = null;
        ratingPoints = 0;
        players = null;
    }

    Club(String name, String country, int ratingPoints, Player[] players) {
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }

    void printClubData() {
        System.out.println("Name: " + name + " Country: " + country + " RatingPoints: " + ratingPoints + " Players:");

        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
    }
}
