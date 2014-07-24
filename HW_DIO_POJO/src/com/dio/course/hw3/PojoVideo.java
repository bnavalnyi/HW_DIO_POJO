package com.dio.course.hw3;

public class PojoVideo {
	private Quality eQuality;
	private String sGenre;
	private double dDuration;
	
	
	
	public PojoVideo(Quality eQuality, String sGenre, double dDuration) {
		super();
		this.eQuality = eQuality;
		this.sGenre = sGenre;
		this.dDuration = dDuration;
	}
	
	
	public final Quality geteQuality() {
		return eQuality;
	}
	public final void seteQuality(Quality eQuality) {
		this.eQuality = eQuality;
	}
	public final String getsGenre() {
		return sGenre;
	}
	public final void setsGenre(String sGenre) {
		this.sGenre = sGenre;
	}
	public final double getdDuration() {
		return dDuration;
	}
	public final void setdDuration(double dDuration) {
		this.dDuration = dDuration;
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
		result = prime * result + ((sGenre == null) ? 0 : sGenre.hashCode());
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
		PojoVideo other = (PojoVideo) obj;
		if (Double.doubleToLongBits(dDuration) != Double
				.doubleToLongBits(other.dDuration))
			return false;
		if (eQuality != other.eQuality)
			return false;
		if (sGenre == null) {
			if (other.sGenre != null)
				return false;
		} else if (!sGenre.equals(other.sGenre))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PojoVideo [eQuality=" + eQuality + ", sGenre=" + sGenre
				+ ", dDuration=" + dDuration + "]";
	}
	
	

}
