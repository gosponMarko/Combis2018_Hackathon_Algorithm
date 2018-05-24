
public class Donor {

	Integer id;
	Float freq;
	Integer daysPassed;
	BloodType bloodType;
	Sex sex;
	Integer distance;
	float probability;

	public Donor(){
	}

	public Donor(Donor anotherOne){
		this.id=anotherOne.id;
		this.freq=anotherOne.freq;
		this.daysPassed=anotherOne.daysPassed;
		this.bloodType=anotherOne.bloodType;
		this.sex=anotherOne.sex;
		this.distance=anotherOne.distance;
		this.probability=anotherOne.probability;
	}

	public Donor(Integer id, Float freq, Integer daysPassed, Sex sex, BloodType bloodType, Integer distance) {
		super();
		this.id = id;
		this.freq = freq;
		this.daysPassed = daysPassed;
		this.sex = sex;
		this.bloodType = bloodType;
		this.distance = distance;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getFreq() {
		return freq;
	}

	public void setFreq(Float freq) {
		this.freq = freq;
	}

	public Integer getDaysPassed() {
		return daysPassed;
	}

	public void setDaysPassed(Integer daysPassed) {
		this.daysPassed = daysPassed;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public BloodType getBloodType() {
		return bloodType;
	}

	public void setBloodType(BloodType bloodType) {
		this.bloodType = bloodType;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public float getProbability() {
		return probability;
	}

	public void setProbability(float probability) {
		this.probability = probability;
	}

	public void setParameters(String line){

		String lines[] = line.split(",");

		id = Integer.valueOf(lines[0]);
		freq = Float.valueOf(lines[1]);
		daysPassed = Integer.valueOf(lines[2]);
		if(lines[3].equals("0-")){
			bloodType = BloodType.valueOf("OM");
		} else if (lines[3].equals("0+")){
			bloodType = BloodType.valueOf("OP");
		} else if (lines[3].equals("A-")){
			bloodType = BloodType.valueOf("AM");
		} else if (lines[3].equals("A+")){
			bloodType = BloodType.valueOf("AP");
		} else if (lines[3].equals("B-")){
			bloodType = BloodType.valueOf("BM");
		} else if (lines[3].equals("B+")){
			bloodType = BloodType.valueOf("BP");
		} else if (lines[3].equals("AB-")){
			bloodType = BloodType.valueOf("ABM");
		} else if (lines[3].equals("AB+")){
			bloodType = BloodType.valueOf("ABP");
		}
		if(lines[4].equals("M")){
			sex = Sex.valueOf("M");
		} else if (lines[4].equals("Z")){
			sex = Sex.valueOf("Z");
		}
		distance = Integer.valueOf(lines[5]);

	}

}
