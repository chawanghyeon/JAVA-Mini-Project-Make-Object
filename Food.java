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
	@Override //Override�� ���ϸ� object�ȿ� �ִ� �ּҰ��� ��ȯ�ϱ� ������ override�� �Ἥ 
	public String toString() {
		return "Food [foodName=" + foodName + "]";
	}

	private String foodName;
}
