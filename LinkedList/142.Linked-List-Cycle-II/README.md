142. Linked List Cycle II

时间复杂度：O(n)
空间复杂度：O(1)

双指针/快慢指针

思路1：
快慢指针重逢时，肯定出现环了。要确定是否是环的起点，需要另外一个慢指针从head开始遍历，slow1和slow2重逢的点就是
环的起点。因为fast是slow1速度的两倍，走过的长度也是slow1的两倍。

此时我们声明一个slow2从head开始遍历，知道slow1和slow2重逢那么就是环的起点。


       a                b
head ------ position -------- meet ----
		|		      |
		|		      |
  		 --------------------- 
                         c

fast走过的长度为  a + b + c + b = a + 2b + c
slow1走过的长度为 a + b
因为 fast长度为slow的两倍
所以 a + 2b + c = 2a + 2b  => a = c

因为a和c一样长了 所以从meet的位置到环的入口刚好等于head到环的起点
所以slow2从head出发并且再次与slow1碰到的地方就是环的起点


思路2：
用hashSet做
空间复杂度为O(N)
