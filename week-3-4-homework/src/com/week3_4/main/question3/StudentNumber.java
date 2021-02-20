package com.week3_4.main.question3;

public class StudentNumber implements Comparable<StudentNumber> {
	private String stdNo;

	public StudentNumber(String stdNo) {
		this.stdNo = stdNo;
	}
	
	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}

	
	@Override
	public int compareTo(StudentNumber o) {
		
		return this.getStdNo().compareTo(o.getStdNo());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stdNo == null) ? 0 : stdNo.hashCode());
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
		StudentNumber other = (StudentNumber) obj;
		if (stdNo == null) {
			if (other.stdNo != null)
				return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
	
		StringBuilder builder =  new StringBuilder();
		
		builder.append(this.getStdNo());
		builder.append("-");		
		return builder.toString();
	}
}
