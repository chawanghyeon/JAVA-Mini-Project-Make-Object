package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Food {
	@Override //Override를 안하면 object안에 있는 주소값을 반환하기 때문에 override를 써서 
	public String toString() {
		return "Food [foodName=" + foodName + "]";
	}

	private String foodName;
}
