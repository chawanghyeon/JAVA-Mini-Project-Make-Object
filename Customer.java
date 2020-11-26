/*학습내용
 * 1. 재사용성을 고려한 설계
 * 2. 객체 생성관점에서
 * 	1. 모든 멤버 데이터 초기화 할 수도 있음
 * 	2. name만 초기화 할 수 도 있음
 *  3. age값만 "	"
 *  4. 해결책
 *  	- 필요한 시점(호출 시점)에 생성자를 동적으로 생성하는 관점에서 해석
 *  5. 개발 방식
 *  	-Builder pattern
 */

package model.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Customer {
   private String name;   
   private int age;
   private String grade; //vvip, vip, silver
   private Car car;
   private Food food;
  
//   //age를 수정할 수 있는 기능
//   //newAge는 setAge() 호출시 생성되고 실행 종료시에 자동소멸
//   //local, stack변수, temporary변수, automatic 변수
//   void setAge(int newAge) {
//      if(newAge>=1) {
//         age = newAge;
//      }else {
//         System.out.println("error");
//      }
//   }
//   
//   //age 변수값 반환하는 메소드 기능
//   int getAge() {
//      return age;
//   }
   
}