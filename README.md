# android-lockpattern

- Version: [`12.0.0`](version-info.md) _(December 23rd, 2016)_
    + _Starting from `8.0.0`, the library uses [Semantic Versioning 2.0.0]_
- License: [Apache License v2.0](LICENSE)
- Maven artifacts are signed with: [`063F E7CB 4F32 4914 996E  388F BA2F 0C52 1F33 83EF`](https://haibison.bitbucket.io/haibison.asc)
- Project page: <https://bitbucket.org/haibison/android-lockpattern>
- Demo: <https://play.google.com/store/apps/details?id=group.pals.android.lib.ui.lockpattern.demo>
- For developers: [Wiki], [API documentation].

---

## Features

- Requires: Android 2.1+ (API 7+)
- Supported IDE: Android Studio
- _No run-time dependencies_
- _Designed with developers in mind._ You can pick up a stranger and weird library like this one, then use it right away without worrying about
  it invading your own [preferences][SharedPreferences], or breaking your app's resource names (or other libraries' resource names). Short
  answer: it uses a UUID for its preference file name, and a CRC-32 string to prefix its resource names (see [FAQs]).
- Designed for both _phones and tablets_
- Stealth mode (invisible pattern)
- Many built-in themes:
    + Dark/Light
    + Light with dark action bar (available from API 7+, but only works from API 14+)
    + Dark/Light dialogs
    + Dark/Light `DialogWhenLarge` (available from API 7+, but only works from API 11+)
- Ability to generate and let the user verify CAPTCHA pattern


In short, you can use this library in your closed source/commercial apps with or without our knowledge. Hope you enjoy it  `:-)`

---

## Credits

We sincerely thank all of our friends -- who have been contributing to this project.  We hope this project will be always useful for everyone.

* C
* [Steven Byle](http://stackoverflow.com/users/1507439/steven-byle)
* Thomas Breitbach
* Yan Cheng Cheok (Project Admin of [JStock](http://jstock.sourceforge.net/))
* [Damonzh](https://github.com/Damonzh)
* [Nikita Osipov](https://github.com/nikkoss)
* [cdotchen](https://bitbucket.org/cdotchen/)
* [Andre Batista da Silva](https://bitbucket.org/andre_bts/)
* And others

---

## History

_For newer versions, please check file [`version-info.md`](version-info.md)._

* ...

* Version 7.0.0
    + *Release: October 28th, 2015*
    + Made dependency `support-annotations` always latest version.
    + Removed `LoadingDialog`.

* Version 6.0.0
    + *Release: October 10th, 2015*
    + `LockPatternActivity`: added `IntentBuilder`.
    + Renamed package `haibison.android.lockpattern.util` to `haibison.android.lockpattern.utils`.
    + Renamed interface `IEncrypter` to `Encrypter`.
    + Added support library `support-annotations`, to decorate methods, parameters...

* Version 5.0.1
    + *Release: September 2nd, 2015*
    + Declared `LockPatternActivity` in manifest.

* Version 5.0.0
    + *Release: September 2nd, 2015*
    + Removed support for Eclipse IDE.
    + Refactored some resource names.
    + Updated helper method `LockPatternActivity#call_startActivityForResult()`.

* Version 4.0.0
    + *Release: June 20th, 2015*
    + Switch to Gradle based (for Android Studio IDE).
    + Update styles.
    + Refactor some classes, resource names.

* Version 3.2.1 beta (#46)
    + *Initialize: January 23rd, 2015*

* Version 3.2 (#45)
    + *Release:* January 19th, 2015
    + Update based code from AOSP Lollipop.
    + Drop support for APIs < 7.
    + Add static helper methods for creating new `Intent`'s and calling `startActivityForResult(Intent, int)` from an
      `Activity`, framework `Fragment` or support library `Fragment`.
    + Rename `EXTRA_INTENT_ACTIVITY_FORGOT_PATTERN` to `EXTRA_PENDING_INTENT_FORGOT_PATTERN`. Note that its value type
      is also changed from `Intent` to `PendingIntent`.
    + Fix small issues.

* Version 3.1.1 beta (#44)
    + *Initialize:* April 04, 2014

* Version 3.1 (#43)
    + *Release:* March 10, 2014
    + Change package name to `com.haibison.android.lockpattern`.
    + Change prefixes:
        - From `alp_` to `alp_42447968_`.
        - From `Alp.` to `Alp.42447968.`.
    + Optimize code and make some other minor changes.

* Version 3.0.8 beta
    + *Initialize:* February 26, 2014

* Version 3.0.7
    + *Release:* February 21, 2014
    + Fix `NullPointerException` while loading settings from manifest.

* Version 3.0.6
    + *Release:* February 19, 2014
    + Add support to directly configure settings via AndroidManifest.xml (tag `<meta-data>`).

* Version 3.0.6 beta
    + *Initialize:* February 18, 2014

* Version 3.0.5
    + *Release:* Feburary 12, 2014
    + Add `SimpleWeakEncryption`.
    + Update `LockPatternView` to branch `kitkat-release` (commit: `c46c4a6765196bcabf3ea89771a1f9067b22baad`).
    + Update Javadocs, some minor changes...

* Version 3.0.5 beta
    + *Initialize:* January 12, 2014

* Version 3.0.4
    + *Release:* January 12, 2014
    + Refactor package `prefs` to a single class `util.Settings`.
    + Add `LoadingDialog` for the case that implementation of `IEncrypter` takes lots of time to finish.

* Version 3.0.4 beta
    + *Initialize:* January 11, 2014

* Version 3.0.3
    + *Release:* December 18, 2013
    + Optimize code.

* Version 3.0.2
    + *Release:* December 18, 2013
    + Add theme light with dark action bar (for API 14+).

* Version 3.0.1
    + *Release:* October 10, 2013
    + Use default icon set (from AOSP).

* Version 3.0
    + *Release:* September 15, 2013
    + Upgrade IEncrypter.

* Version 2.9
    + *Release:* August 11, 2013
    + Fix dialog themes in API 11.
    + Optimize code.

* Version 2.9 beta
    + *Initialize:* July 05, 2013

* Version 2.8
    + *Release:* July 02, 2013
    + Add new extra `EXTRA_INTENT_ACTIVITY_FORGOT_PATTERN` to help the user recover the pattern if he/ she forgot it.
    + Change `char[] IEncrypter.encrypt(Context, char[])` to `char[] IEncrypter.encrypt(Context, List<Cell>)`.
    + Rename `EXTRA_OK_PENDING_INTENT`, `EXTRA_CANCELLED_PENDING_INTENT` to `EXTRA_PENDING_INTENT_OK` and
      `EXTRA_PENDING_INTENT_CANCELLED`.
    + Optimize code.
    + Some minor changes...

* Version 2.8 beta
    + *Initialize:* June 20, 2013

* Version 2.7
    + *Release:* June 20, 2013
    + Add new action `ACTION_VERIFY_CAPTCHA`.

* Version 2.7 beta
    + *Initialize:* May 28, 2013

* Version 2.6
    + *Release:* May 18, 2013
    + Use `UPPER_CASE` for `static final` fields and enums;
    + Move most of dynamic settings to `SharedPreferences`;
    + Change `IEncrypter`;

* Version 2.6 beta
    + *Initialize:* May 15, 2013

* Version 2.5.1
    + *Release:* April 15, 2013
    + Fix delivering result to `ResultReceiver`.

* Version 2.5
    + *Release:* April 15, 2013
    + Upgrade UI;
    + Add options:
        - for setting minimum wired dots in mode creating pattern;
        - for setting maximum tries and determining the number of tries that the user did in mode comparing patterns;
        - thanks to David Myers for his feedbacks;
    + Use fixed size for `LockPatternActivity` in large screens with dialog themes;
    + Add options for sending result to a `PendingIntent` and/ or `ResultReceiver`;
    + Fix minor bugs; optimize code;

* Version 2.5 beta
    + *Initialize:* March 18, 2013

* Version 2.4
    + *Release:* March 16, 2013
    + Merge latest code from AOSP;
    + Use action names instead of extra fields for different types of handlers:
        - `_ActionCreatePattern`
        - `_ActionComparePattern`
    + Add built-in themes: default dark and dark dialog;
    + Add stealth-mode;
    + New icon set;
    + Optimize code and UI; special thanks to [Steven Byle](http://stackoverflow.com/users/1507439/steven-byle):
        - <http://stackoverflow.com/a/15424636/1521536>

* Version 2.3
    + Update info: August 28, 2012
    + The [serious bug](https://code.google.com/p/android-lockpattern/issues/detail?id=1) was invalid.

* Version 2.3
    + *Release:* August 28, 2012
    + Fixed serious bug: key `_PaternSha1` is deprecated but is used to return the pattern;
    + Removed all fields/ methods which were deprecated in old versions;

* Version 2.2
    + *Release:* August 17, 2012
    + added: Spanish language; special thanks to C. - a kind friend who helped us translate the library into his mother
      language;

* Version 2.1
    + *Release:* July 29, 2012
    + turn off `AutoSave` by default;
    + add new method `IEncrypter.encrypt(Context, String);`
    + set method `IEncrypter.encrypt(String)` as deprecated;

* Version 2.1 beta
    + Initialization: July 21, 2012

* Version 2
    + *Release:* July 15, 2012
    + add support for encryption;

* Version 2 beta
    + Initialization: July 12, 2012

* Version 1.5.5
    + *Release:* June 22, 2012
    + set max width and height for `LockPatternView` to `400dp` for tablet;

* Version 1.5.4
    + *Release:* June 09, 2012
    + Fix bug: in mode `CreatePattern`, `LockPatternActivity` recognized wrong the confirmed pattern;

* Version 1.5.4 beta
    + Initialization: June 07, 2012

* Version 1.5.3
    + *Release:* June 07, 2012
    + ability to change theme in runtime;
    + save and restore controls' state after screen orientation changed;

* Version 1.5.3 beta
    + Initialization: May 21, 2012
    + make `LockPatternView`'s gravity center;

* Version 1.5.2
    + *Release:* May 21, 2012
    + in landscape mode, move button `Cancel` to bottom;

* Version 1.5.1
    + *Release:* May 21, 2012
    + set `LockPatternView`'s gravity center;

* Version 1.5
    + *Release:* May 21, 2012
    + due to [this bug](https://code.google.com/p/android/issues/detail?id=30622), so we prefix all resource names with
      `alp_`;
    + add layout for landscape mode;
    + update coding style:
        - prefix global fields with `m`;
        - prefix static final fields with `_`;

* Version 1.4
    + *Release:* April 29, 2012
    + change UI;
    + determine and use user's haptic feedback;

* Version 1.2
    + *Release:* March 09, 2012
    + make sure `LockPatternUtils.patternToSha1()` returns lower case string;

* Version 1.1
    + *Release:* March 08, 2012
    + fix security issue about using `SharedPreferences`;

* Version 1.0
    + *Release:* March 08, 2012
    + first release;
    + create pattern;
    + compare to existing pattern;

[Semantic Versioning 2.0.0]: http://semver.org/spec/v2.0.0.html
[Wiki]: https://bitbucket.org/haibison/android-lockpattern/wiki/
[FAQs]: https://bitbucket.org/haibison/android-lockpattern/wiki/FAQs
[API documentation]: https://haibison.bitbucket.io/apidocs/android-lockpattern
[SharedPreferences]: https://developer.android.com/reference/android/content/SharedPreferences.html
