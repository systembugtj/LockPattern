# `9.0.0` _(May 7th, 2016)_

- Support: Android 7+ ([Eclair MR1][Android-Eclair-MR1])

---

## Dependencies

- [`org.bitbucket.haibison:underdogs:+`][#org.bitbucket.haibison:underdogs]


## Changes

- `LockPatternActivity.IntentBuilder`: added methods `setTitle(int)`, `setTitle(CharSequence)`, `setLayout(int)`, `buildPendingIntent(...)`.
- Updated documentation, optimized code.
- Added Chinese translation `zh-rTW` (thanks to @cdotchen).
- Added Gradle Wrapper `2.12`, updated Android plugin for Gradle to `2.1.0`.
- Moved `haibison.android.lockpattern.utils.Alp` to `haibison.android.lockpattern.Alp`.
- Some other minor changes...


[Android-Eclair-MR1]: https://developer.android.com/reference/android/os/Build.VERSION_CODES.html#ECLAIR_MR1

[#org.bitbucket.haibison:underdogs]: https://bitbucket.org/haibison/underdogs