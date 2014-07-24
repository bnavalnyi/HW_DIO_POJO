package com.dio.course.hw3;

public class PojoAudio {

	
	private double dDuration;
	private String  sName;
	private Quality eQuality;
	private String sTag;
	
	
	
	public String merge(PojoAudio a_obj,PojoAudio v_obj)
	{
		
		return  "Merge";		
	}
	public void testMerg()
	{
		assert(merge(new PojoAudio(12,"121212", Quality.HIGHT, "tag"),new PojoAudio(12,"121212", Quality.HIGHT, "tag")).equals("Merge"));
	}
	
	public PojoAudio(double dDuration, String sName, Quality eQuality,
			String sTag) {
		super();
		this.dDuration = dDuration;
		this.sName = sName;
		this.eQuality = eQuality;
		this.sTag = sTag;
	}
	public final double getdDuration() {
		return dDuration;
	}
	public final void setdDuration(double dDuration) {
		this.dDuration = dDuration;
	}
	public final String getsName() {
		return sName;
	}
	public final void setsName(String sName) {
		this.sName = sName;
	}
	public final Quality geteQuality() {
		return eQuality;
	}
	public final void seteQuality(Quality eQuality) {
		this.eQuality = eQuality;
	}
	public final String getsTag() {
		return sTag;
	}
	public final void setsTag(String sTag) {
		this.sTag = sTag;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(dDuration);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((eQuality == null) ? 0 : eQuality.hashCode());
		result = prime * result + ((sName == null) ? 0 : sName.hashCode());
		result = prime * result + ((sTag == null) ? 0 : sTag.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PojoAudio other = (PojoAudio) obj;
		if (Double.doubleToLongBits(dDuration) != Double
				.doubleToLongBits(other.dDuration))
			return false;
		if (eQuality != other.eQuality)
			return false;
		if (sName == null) {
			if (other.sName != null)
				return false;
		} else if (!sName.equals(other.sName))
			return false;
		if (sTag == null) {
			if (other.sTag != null)
				return false;
		} else if (!sTag.equals(other.sTag))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PojoAudio [dDuration=" + dDuration + ", sName=" + sName
				+ ", eQuality=" + eQuality + ", sTag Year=" + sTag + "]";
	}
	
	
	
	
}
