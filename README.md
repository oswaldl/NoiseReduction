# NoiseReduction

this is a simple noise reduction.
这是一个简单的去噪程序.

input: string data
output: true/false, true means data is noise, false means data is not noise.

noise judge rules:
1. contains only punctuations, such as [,#$%^,.?/
2. contains only numbers, such as 2,4,5,6
3. is not chinese, including messy code which cannot recognize, such as 'тарабарщина','hi how do you do'
4. repeat words, such as '哈哈哈哈哈哈'
5. empty