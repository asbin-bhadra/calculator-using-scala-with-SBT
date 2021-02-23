// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.knoldus

class CalculatorImpl{

    // add function returns sum of two numbers
    def add(num1:Double, num2:Double) : Double ={
        num1 + num2
    }

    // sub Function returns the diffrence between two numbers
    def sub(num1:Double, num2:Double) : Double ={
        num1 - num2
    }

    // mul function returns the product of two nnumbers
    def mul(num1:Double, num2:Double) : Double ={
        num1 * num2
    }

    // div function returns the division of two numbers
    def div(numerator:Double, denominator:Double) : Double ={

        // Throws an arithmetic exception if tried to divide by zero
        if(denominator == 0){
            throw new ArithmeticException("Number can not be divided by Zero")
        }
        else{
            numerator.toDouble / denominator
        }
    }

    // pow function returns x raised to the power of y
    def pow(base:Double, exp:Int) : Double ={
        var result:Double = 1.0
        var absoluteExp = exp
        if(exp < 0){
            absoluteExp = -1 * exp
        }
        while(absoluteExp != 0){
            result*=base
            absoluteExp-=1
        }
        if(exp < 0){
            result = 1.toDouble/result
        }
        result
    }

    // abs returns the absolute value of a number
    def abs(num:Double) : Double ={
        var result = num
        if(num<0){
            result = -1*num
        }
        result
    }

    // mod returns remainder after a number is divided by another number
    def mod(divident:Double, divisor:Double) : Double ={

        // throws an exception if zero provided as divisor
        if (divisor == 0){
            throw new ArithmeticException("Divisor must not be Zero")
        }
        else{
            divident % divisor
        }
    }

    // max returns largest value between two numbers
    def max(num1:Double, num2:Double) : Double ={
        val maxValue = if (num1 > num2) num1 else num2
        maxValue
    }

    // min returns smallest value between two numbers
    def min(num1:Double, num2:Double) : Double ={
        val minValue = if (num1 < num2) num1 else num2
        minValue
    }
}
