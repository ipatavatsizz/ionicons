@echo off
setlocal enabledelayedexpansion
for %%f in (*Outline*.kt) do (
    set "newname=%%f"
    set "newname=!newname:=!"
    ren "%%f" "!newname!"
)