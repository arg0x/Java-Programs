public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public boolean equals(Object compared) {

        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive newCompare = (Archive) compared;

        if (this.identifier.equals(newCompare.identifier)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }

}
