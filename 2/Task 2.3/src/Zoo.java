public class Zoo {

    private Tiger tiger;
    private Giraffe giraffe;
    private Lion lion;

    public Zoo() {
    }

    public Tiger getTiger() {
        return tiger;
    }

    public void setTiger(Tiger tiger) {
        this.tiger = tiger;
    }

    public Giraffe getGiraffe() {
        return giraffe;
    }

    public void setGiraffe(Giraffe giraffe) {
        this.giraffe = giraffe;
    }

    public Lion getLion() {
        return lion;
    }

    public void setLion(Lion lion) {
        this.lion = lion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zoo{");
        sb.append("tiger=").append(tiger);
        sb.append(", giraffe=").append(giraffe);
        sb.append(", lion=").append(lion);
        sb.append('}');
        return sb.toString();
    }
}
