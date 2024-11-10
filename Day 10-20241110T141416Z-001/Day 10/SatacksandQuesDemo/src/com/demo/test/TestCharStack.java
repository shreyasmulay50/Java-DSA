package com.demo.test;

import com.demo.stacks.MyStack;

public class TestCharStack {

	public static void main(String[] args) {
		MyStack st=new MyStack(20);
		String s="This is string";
		for(int i=0;i<s.length();i++) {
			if(!st.isFull())
				st.push(s.charAt(i));
		}
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		

	}

}

/*
import React, { useState } from 'react'

function ScoreBoard2() {

    const [Player, SetP] = useState("Anurag");
    const [Count, SetC] = useState(0);

    const SetPlayer =()=>{
        SetP("Aman");
    }

    const Increment = () =>{
        SetC(Count+4);
    }
    const Decrement = () =>{
        SetC(Count-1);
    }
  return (
    <>
    <div>
        <h1>
            {Player} has scored {Count}
        </h1>
    </div>
    <div>
        <button onClick={SetPlayer}>Set Name</button>
        <button onClick={Increment}>+</button>
        <button onClick={Decrement}>-</button>
    </div>
    </>
  )
}

export default ScoreBoard2
*/