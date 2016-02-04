# `8.0.0` _(February 4th, 2016)_

- Support: Android 7+ ([Eclair MR1][Android-Eclair-MR1])

---

## Dependencies

- [`org.bitbucket.haibison:underdogs:+`][#org.bitbucket.haibison:underdogs]


## Changes

- Replaced dependency [`com.android.support:support-annotations`][#com.android.support:*] with [Underdogs][#org.bitbucket.haibison:underdogs].
- Added some more helper methods to `LockPatternActivity.IntentBuilder`:
    + `makeRestartTask()`
    + `start()`
- `LockPatternActivity` now throws `UnsupportedOperationException` if incoming intent uses unsupported actions.


[Android-Eclair-MR1]: https://developer.android.com/reference/android/os/Build.VERSION_CODES.html#ECLAIR_MR1

[#com.android.support:*]: https://developer.android.com/tools/support-library/index.html
[#org.bitbucket.haibison:underdogs]: https://bitbucket.org/haibison/underdogs
