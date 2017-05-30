# Calculator
Error:


<h4>Number formatting does not take into account locale settings. Consider using String.format instead android studio</h4>
<br>
<h5>solution:</h5>
<br>
This is a Lint warning called "TextView Internationalization" which says :
<br>
setText(String.format("%d", getIntent().getExtras().<error>getInt("level"))));</error>
<br>
In you LoginActivity, you insert String! named "a" into Intent.
<br>
In your StudentActivity, you try to grab Integer!! thanks for call getInt().
Simply change whole line to
<br>
textView.setText(getIntent().getExtras().<b>getString("level"));</b>
