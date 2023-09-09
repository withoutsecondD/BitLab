package OtherPractice.Wildcards.Case1;

class NISStudent extends Student {
    private int rank;

    @Override
    public String toString() {
        return "NISStudent{" +
                "rank=" + rank +
                '}';
    }

    public NISStudent(int age, int height, boolean fromAlmaty, int rank) {
        super(age, height, fromAlmaty);
        this.rank = rank;
    }

    public NISStudent() {
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
