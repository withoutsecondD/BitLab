package OtherPractice.Wildcards.Case1;

import java.util.Collection;

class ScholarshipStudent extends Student {
    private boolean onIncreasedStipend;

    @Override
    public String toString() {
        return "ScholarshipStudent{" +
                "onIncreasedStipend=" + onIncreasedStipend +
                '}';
    }

    public ScholarshipStudent(int age, int height, boolean fromAlmaty, boolean onIncreasedStipend) {
        super(age, height, fromAlmaty);
        this.onIncreasedStipend = onIncreasedStipend;
    }

    public ScholarshipStudent() {
    }

    public boolean isOnIncreasedStipend() {
        return onIncreasedStipend;
    }

    public void setOnIncreasedStipend(boolean onIncreasedStipend) {
        this.onIncreasedStipend = onIncreasedStipend;
    }
}
