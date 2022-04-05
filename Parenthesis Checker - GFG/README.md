# Parenthesis Checker
## Easy 
<div class="problem-statement">
                <p><a onclick="gtagHelperFunction('clickopen','salesevent_gsc_problemspage_promobanner')" href="https://practice.geeksforgeeks.org/summer-carnival-2022?utm_source=practiceproblems&amp;utm_medium=problemspromobanner&amp;utm_campaign=gsc22" target="_blank"></a></p><div style="margin: 14px 0px !important;" class="row"><a onclick="gtagHelperFunction('clickopen','salesevent_gsc_problemspage_promobanner')" href="https://practice.geeksforgeeks.org/summer-carnival-2022?utm_source=practiceproblems&amp;utm_medium=problemspromobanner&amp;utm_campaign=gsc22" target="_blank">             <div class="col-md-12" style="cursor:pointer;background: #EFF8F3 0% 0% no-repeat padding-box; display: flex; align-items: center; position:                 relative; padding: 1.5%; border-radius: 10px; display: inline-block; text-align: center; font-weight: 600; color: #333"> <img src="https://media.geeksforgeeks.org/img-practice/gcs2022thumbnail-1649059370.png" alt="Lamp" width="46" height="40" style="background: transparent 0% 0% no-repeat padding-box;opacity: 1; margin: 0 16px;" class="img-responsive"> Geeks Summer Carnival is LIVE NOW &nbsp; <i class="fa fa-external-link" aria-hidden="true"></i> </div></a></div><p><span style="font-size:18px">Given an expression string <strong>x</strong>. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.<br>
For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
{([])}
<strong>Output</strong>: 
true
<strong>Explanation</strong>: 
<span style="color:#FF0000">{</span> <span style="color:#00FF00">(</span> <span style="color:#0000CD">[</span> <span style="color:#0000CD">]</span> <span style="color:#00FF00">)</span> <span style="color:#FF0000">}.&nbsp;</span><span style="color:#000000">Same colored brackets can form 
balaced pairs, with 0 number of 
unbalanced bracket.</span>
</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>: 
()
<strong>Output</strong>: 
true
<strong>Explanation</strong>: 
<span style="color:#00FF00">()</span><span style="color:#000000">. Same bracket can form balanced pairs, 
and here only 1 type of bracket is 
present and in balanced way.</span></span>
</pre>

<p><span style="font-size:18px"><strong>Example 3:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>: 
([]
<strong>Output</strong>: 
false
<strong>Explanation</strong>: 
<span style="color:#00FF00">(</span><span style="color:#0000CD">[]</span>.<span style="color:#000000"> Here square bracket is balanced but 
the small bracket is not balanced and 
Hence , the output will be unbalanced.</span></span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
This is a <strong>function </strong>problem. You only need to complete the function <strong>ispar()&nbsp;</strong>that takes a&nbsp;<strong>string </strong>as a&nbsp;<strong>parameter </strong>and returns a boolean value&nbsp;<strong>true </strong>if <strong>brackets </strong>are <strong>balanced </strong>else <strong>returns false</strong>. The <strong>printing </strong>is done <strong>automatically </strong>by the <strong>driver code</strong>.</span><br>
<br>
<span style="font-size:18px"><strong>Expected Time Complexity</strong>: O(|x|)<br>
<strong>Expected Auixilliary Space</strong>: O(|x|)</span><br>
<br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ |x| ≤ </span><span style="font-size:18px">32000</span></p>

<p><span style="font-size:18px"><strong>Note</strong>: The drive code prints "balanced" if function return true, otherwise it prints "not balanced".</span></p>
 <p></p>
            </div>