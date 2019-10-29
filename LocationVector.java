class LocationVector {

    private final int deltaRow;
    private final int deltaColumn;

    public LocationVector(final int deltaRow, final int delteColumn) {
        super();
        this.deltaRow = deltaRow;
        this.deltaColumn = delteColumn;
    }
    
    public int getDeltaRow() {
        return deltaRow;
    }
    
    public int getDeltaColumn() {
        return deltaColumn;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + deltaRow;
        result = prime * result + deltaColumn;
        return result;
    }
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LocationVector other = (LocationVector) obj;
        if (deltaRow != other.deltaRow) {
            return false;
        }
        if (deltaColumn != other.deltaColumn) {
            return false;
        }
        return true;
    }
}
