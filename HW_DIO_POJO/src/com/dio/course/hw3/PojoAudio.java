package com.dio.course.hw3;

public class PojoAudio {

	
	private double dDuration;
	private String  sName;
	private Quality eQuality;
	private String sTag;


    //local code review (vtegza): I belive this method should be moved to different class and that class should implement Unite interface @ 27.07.14
    public String merge(PojoAudio a_obj,PojoAudio v_obj)
	{
        //local code review (vtegza): no actual functionality @ 27.07.14
        return  "Merge";		
	}
	public void testMerg()
	{
        //local code review (vtegza): assertations should not only check logic, it also should explain what it do.. @ 27.07.14
        PojoAudio firtAudio = new PojoAudio(12, "121212", Quality.HIGHT, "tag");
        PojoAudio secoundAudion = new PojoAudio(12, "121212", Quality.HIGHT, "tag");
        String hardCodedValue = "Merge";

        String resultValue = merge(firtAudio, secoundAudion);
        assert(resultValue.equals(hardCodedValue));
	}
	
	public PojoAudio(double dDuration, String sName, Quality eQuality,
			String sTag) {
        //local code review (vtegza): no need for super() @ 27.07.14
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

    //local code review (vtegza): use StringBuilder version of toString() @ 27.07.14
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PojoAudio{");
        sb.append("dDuration=").append(dDuration);
        sb.append(", sName='").append(sName).append('\'');
        sb.append(", eQuality=").append(eQuality);
        sb.append(", sTag='").append(sTag).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
