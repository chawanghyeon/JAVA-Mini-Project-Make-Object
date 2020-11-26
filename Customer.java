/*�н�����
 * 1. ���뼺�� ����� ����
 * 2. ��ü ������������
 * 	1. ��� ��� ������ �ʱ�ȭ �� ���� ����
 * 	2. name�� �ʱ�ȭ �� �� �� ����
 *  3. age���� "	"
 *  4. �ذ�å
 *  	- �ʿ��� ����(ȣ�� ����)�� �����ڸ� �������� �����ϴ� �������� �ؼ�
 *  5. ���� ���
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
  
//   //age�� ������ �� �ִ� ���
//   //newAge�� setAge() ȣ��� �����ǰ� ���� ����ÿ� �ڵ��Ҹ�
//   //local, stack����, temporary����, automatic ����
//   void setAge(int newAge) {
//      if(newAge>=1) {
//         age = newAge;
//      }else {
//         System.out.println("error");
//      }
//   }
//   
//   //age ������ ��ȯ�ϴ� �޼ҵ� ���
//   int getAge() {
//      return age;
//   }
   
}