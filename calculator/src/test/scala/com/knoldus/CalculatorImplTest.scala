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
import org.scalatest.flatspec.AnyFlatSpec

class CalculatorImplTest extends AnyFlatSpec{

    // Object of class CalculatorImpl
    val obj = new CalculatorImpl()

    // Test case for add function
    "Add" should "return result if interger number provided" in {
        assert(obj.add(2.0,3.0) == 5)
    }
    it should "return result if float number provided" in {
        assert(obj.add(6.5,55.0) == 61.5)
    }
    it should "return result if 0 provided" in {
        assert(obj.add(0,3.0) == 3)
    }
    it should "return result if negetive integer provided" in {
        assert(obj.add(5.0,-3.0) == 2)
    }
    it should "invalid as 5+4 will not return 10 as output" in {
        assert(!(obj.add(5.0,4.0) == 10))
    }

    // Test case for sub function
    "Sub" should "return result if interger number provided" in {
        assert(obj.sub(3.0,2.0) == 1)
    }
    it should "return result if float number provided" in {
        assert(obj.sub(15.5,3.0) == 12.5)
    }
    it should "return result if 0 provided" in {
        assert(obj.sub(0,3.0) == -3.0)
    }
    it should "return result if negetive integer provided" in {
        assert(obj.sub(5.0,-3.0) == 8)
    }
    it should "invalid as 5-4 will not return 6 as output" in {
        assert(!(obj.sub(5.0,4.0) == 6))
    }

    // Test case for mul function
    "Mul" should "return result if interger number provided" in {
        assert(obj.mul(3.0,2.0) == 6)
    }
    it should "return result if float number provided" in {
        assert(obj.mul(4.5,3.0) == 13.5)
    }
    it should "return result if 0 provided" in {
        assert(obj.mul(0,3.0) == 0)
    }
    it should "return result if negetive integer provided" in {
        assert(obj.mul(5.0,-3.0) == -15.0)
    }
    it should "invalid as 5*4 will not return 10 as output" in {
        assert(!(obj.mul(5.0,4.0) == 10))
    }

    // Test case for div function
    "Div" should "return result if integer number provided" in {
        assert(obj.div(4.0,2.0) == 2)
    }
    it should "return result if float number provided" in {
        assert(obj.div(4.5,2.0) == 2.25)
    }
    it should "return result if negetive number is provided" in {
        assert(obj.div(-54.0,2.0) == -27.0)
    }
    it should "return result if large numbers provided" in {
        assert(obj.div(50000000.0, 10000000.0) == 5)
    }
    it should "return 0 if 0 is provided as numerator" in {
        assert(obj.div(0,2.0) == 0)
    }
    it should "throw ArithmeticException if 0 is provided as denominator" in {
        assertThrows[ArithmeticException]{
            obj.div(2.0,0)
        }
    }
    it should "invalid as 5/4 will not return 12 as output" in {
        assert(!(obj.div(5.0,4.0) == 12))
    }

    // Test case for pow function
    "Pow" should "return result if integer number provided as base and exponent" in {
        val base = 4
        val exp = 2
        assert(obj.pow(base,exp) == 16)
    }
    it should "return result if float number provided as base" in {
        val base = 4.5
        val exp = 2
        assert(obj.pow(base,exp) == 20.25)
    }
    it should "return negetive result if negetive integer number provided as base with odd exponent" in {
        val base = -4
        val exp = 3
        assert(obj.pow(base,exp) == -64.0)
    }
    it should "return possitive result if negetive integer number provided as base with even exponent" in {
        val base = -4
        val exp = 4
        assert(obj.pow(base,exp) == 256)
    }
    it should "invalid as 5 raise to the power 4 will not return 12 as output" in {
        val base = 5
        val exp = 4
        assert(!(obj.pow(base,exp) == 12))
    }
    it should "return result if negetive integer number provided as exponent" in {
        val base = 4
        val exp = -4
        assert(obj.pow(base,exp) == 0.00390625)
    }

    // Test case for abs function
    "Abs" should "return result if possitive integer number provided" in {
        assert(obj.abs(10.0) == 10)
    }
    it should "return result if negetive integer number provided" in {
        assert(obj.abs(-10.0) == 10)
    }
    it should "return result if possitive float number provided" in {
        assert(obj.abs(15.5) == 15.5)
    }
    it should "return result if negetive float number provided" in {
        assert(obj.abs(-15.5) == 15.5)
    }
    it should "invalid as absolute value of 5 will not return 12 as output" in {
        assert(!(obj.abs(5.0) == 12))
    }

    // Test case for mod function
    "Mod" should "return result if positive integer number provided" in {
        assert(obj.mod(10.0,4.0) == 2)
    }
    it should "return result if negetive integer number provided as divident" in {
        assert(obj.mod(-10.0,4.0) == -2.0)
    }
    it should "return result if negetive integer number provided as divisor" in {
        assert(obj.mod(10.0,-4.0) == 2)
    }
    it should "return result if positive float number provided" in {
        assert(obj.mod(10.5,4.0) == 2.5)
    }
    it should "return result if negetive float number provided" in {
        assert(obj.mod(-10.5,4.0) == -2.5)
    }
    it should "throw ArithmeticException if 0 is provided as divisor" in {
        assertThrows[ArithmeticException]{
            obj.mod(10.0,0)
        }
    }
    it should "invalid as 5%4 will not return 10 as output" in {
        assert(!(obj.mod(5.0,4.0) == 10))
    }

    // Test case for max function
    "Max" should "return result if positive integer number provided" in {
        assert(obj.max(10.0,4.0) == 10)
    }
    it should "return result if negetive integer number provided" in {
        assert(obj.max(-10.0,4.0) == 4)
    }
    it should "return result if positive float number provided" in {
        assert(obj.max(10.0,14.5f) == 14.5)
    }
    it should "return result if negetive float number provided" in {
        assert(obj.max(10.0,-14.5) == 10)
    }
    it should "invalid as largest of 5 and 10 will not be 5" in {
        assert(!(obj.max(5.0,10.0) == 5))
    }

    // Test case for min function
    "Min" should "return result if positive integer number provided" in {
        assert(obj.min(20.0,41.0) == 20.0)
    }
    it should "return result if negetive integer number provided" in {
        assert(obj.min(-20.0,41.0) == -20.0)
    }
    it should "return result if positive float number provided" in {
        assert(obj.min(52.0,62.5f) == 52.0)
    }
    it should "return result if negetive float number provided" in {
        assert(obj.min(20.0,-75.5) == -75.5)
    }
    it should "invalid as smallest of 5 and 10 will not be 10" in {
        assert(!(obj.min(5.0,10.0) == 10))
    }
}
