UNIX TOOLS
----------

### pjwc.sh `(word count)`
* **pjwc.sh ** is used to count the number of lines, character and words.

> **pjwc.sh Flags Options:**
>
> - `pjwc.sh -l`  :  **Gives count for lines.**
> - `pjwc.sh -w`  :  **Gives count for words.**
> - `pjwc.sh -c`  :  **Gives count for characters.**

> **pjwc.sh Possible Syntax:**
>
> - `pjwc.sh abc.txt`  : It will give you **count of lines, character and words** for file `abc.txt`.
> - `pjwc.sh abc.txt -l`  : It will give you **count of lines.** for file `abc.txt`.
> - `pjwc.sh abc.txt -w`  : It will give you **count of words.** for file `abc.txt`.
> - `pjwc.sh abc.txt -c`  : It will give you **count of characters.** for file `abc.txt`.
> - `pjwc.sh abc.txt -w -c -l`  : It will work as the first syntax does.

### pjhead.sh `(Get First 10 Lines)`
* **pjhead.sh** is used to get the first 10 `(default)` lines of a file .

> **pjhead.sh Flags Options:**
>
> - `pjhead.sh`  :  **Gives first 10 lines of file.**
> - `pjhead.sh -n20`  :  **Specifying the number of lines, if you want..**

> **pjhead.sh Possible Syntax:**
>
> - `pjhead.sh abc.txt`  : It will give you **first 10 lines** for file `abc.txt`.
> - `pjhead.sh abc.txt -n20`  : It will give you **first 20 lines** for file `abc.txt`.

### pjtail.sh `(Get Last 10 Lines)`
* **pjtail.sh** is used to get the last 10 `(default)` lines of a file .

> **pjtail.sh Flags Options:**
>
> - `pjtail.sh`  :  **Gives last 10 lines of file.**
> - `pjtail.sh -n20`  :  **Specifying the number of lines, if you want..**

> **pjtail.sh Possible Syntax:**
>
> - `pjtail.sh abc.txt`  : It will give you **last 10 lines** for file `abc.txt`.
> - `pjtail.sh abc.txt -n20`  : It will give you **last 20 lines** for file `abc.txt`.

### pjsort.sh `(Get Sorted data with this tool)`
* **pjsort.sh** is used to `(SORT)` the content of a file .

> **pjsort.sh Flags Options:**
>
> - `pjsort.sh`  :  sort the content of a file in **Ascending Order.**
> - `pjsort.sh -r`  :  sort the content of a file in **Descending Order.**

> **pjsort.sh Possible Syntax:**
>
> - `pjsort.sh abc.txt`  : It will give you **Ascending  Order** of data for file `abc.txt`.
> - `pjsort.sh abc.txt -r`  : It will give you **Descending Order** of data for file `abc.txt`.

### pjuniq.sh `(Get Uniq lines)`
* **pjuniq.sh** is used to `Discard` all but one of successive identical lines of file content .

> **pjuniq.sh Possible Syntax:**
>
> - `pjuniq.sh abc.txt`  : It will give you **Unique lines** of data for file `abc.txt`.

### pjReduceSpace.sh `(Reduce to single space)`
* **pjReduceSpace.sh** is used to `Reduce` the multiple space to one space of file content.

> **pjReduceSpace.sh Possible Syntax:**
>
> - `pjReduceSpace.sh abc.txt result.txt`  : It will `replace` all multiple space of file `abc.txt` and store it in `result.txt`.

### pjcut.sh `(cut fields from file content)`
* **pjcut.sh** is used to `cut` the columns of file content based on delimiter and field No.

> **pjcut.sh Flags Options:**
>
> - `pjcut.sh -f`  :  **Specifying the field Number you want.**
> - `pjcut.sh -d`  :  **Specifying the delimiter**

> **pjcut.sh Possible Syntax:**
>
> - `pjcut.sh abc.txt -f2`  : It will give you **second column** of file `abc.txt` cutted by default delimiter.
> - `pjcut.sh abc.txt -f2 -d','`  : It will give you **second column** for file `abc.txt` cutted by delimiter ','

## How to Run Project
> `declare -x UNIX_HOME=$PWD`