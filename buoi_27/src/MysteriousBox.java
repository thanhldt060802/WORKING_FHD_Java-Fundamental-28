public class MysteriousBox<MyType> {

	private MyType value;
	
	public MysteriousBox(MyType value) {
		this.value = value;
	}

    public <T1, T2> MysteriousBox(T1 value1, T2 value2) {
        
    }
	
	public MyType getValue() {
		return this.value;
	}
	
	public void setValue(MyType value) {
		this.value = value;
	}

    public <OtherType> boolean equalsByType(OtherType otherValue) {
		return this.value.getClass().getSimpleName().equals(otherValue.getClass().getSimpleName());
	}
	
	@Override
	public String toString() {
		return String.format("MysteriousBox<%s> [value=%s]", this.value.getClass().getSimpleName(), this.value);
	}

}