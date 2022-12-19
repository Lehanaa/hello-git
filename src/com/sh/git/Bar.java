package com.sh.git;

/**
 * 되돌리기
 * - revert : 지정한 커밋의 작업내용을 취소한 버젼을 새로운 커밋으로 만든다.(conflict날수 있음)
 * 
 * - reset : 지정한 커밋으로 돌아간다.
 * 	- hard : 지정 커밋 이후 변경사항 버림
 * 	- mixed : 지정 커밋 이후 변경사항을 unstaging area 보관. 재추가 후 커밋 가능
 * 	- soft : 지정 커밋 이후 변경사항을 staging area 보관. 즉시 커밋 가능
 * 
 * - merge : 가지친 것을 합친다. 가지친 것을 master에 합친다.
 */
public class Bar {

	public void Foo() {
		System.out.println("Sorry Foo!");
	}

}
