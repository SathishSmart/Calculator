# Calculator
Error:


<h4>Number formatting does not take into account locale settings. Consider using String.format instead android studio</h4>
<br>
<h5>solution:</h5>
<br>
This is a Lint warning called "TextView Internationalization" which says :
<br>
setText(String.format("%d", getIntent().getExtras().<b>getInt("level"))));</b>

<br>
textView.setText(getIntent().getExtras().<b>getString("level"));</b>
