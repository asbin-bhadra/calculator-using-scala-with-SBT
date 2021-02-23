# Calculator Using scala in SBT

## What is Scala?
Scala is a general-purpose programming language providing support for both object-oriented programming and functional programming. The language has a strong static type system. Designed to be concise, many of Scala's design decisions are aimed to address criticisms of Java.

## What is SBT
It is a build tool for Scala projects. I found it is also useful to build java projects. But java programmers are not generally familiar with sbt. They prefer Maven over SBT to build java projects, as Maven is the de facto standard for building java projects.

## About
I have created a calculator using scala language with SBT. I have added some simple functionality of a calculator. You can find the functionality details below.  

## Features
1. add(x,y) - Returns sum of x and y.
1. sub(x,y) - Returns difference of x and y.
1. mul(x,y) - Returns product of x and y.
1. div(x,y) - Returns quotient of x and y.
1. pow(x,y) - Returns value of X raised to the power of y.
1. abs(x)   - Returns absolute value of x.
1. mod(x,y) - Returns remainder of x and y.
1. max(x,y) - Returns largest value between x and y.
1. min(x,y) - Returns smallest value between x and y.

## Compile Code
```
sbt compile
```
## Run Test Cases
```
sbt test
```

## Generate scalastyle config file ( Already created in this project )
```
sbt scalastyleGenerateConfig
```

## Check scalastyle for code
```
sbt scalastyle
```

## Check scalastyle for test cases
```
sbt test:scalastyle
```