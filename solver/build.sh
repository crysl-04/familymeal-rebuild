#!/usr/bin/env bash
# familymeal 求解器：编译 + 运行（Linux / macOS）
# 用法: ./build.sh --seed /path/to/seed [--parity] [--month 11] ...
set -e
cd "$(dirname "$0")"
mkdir -p build
find src -name '*.java' > build/sources.txt
javac -encoding UTF-8 -d build -cp "libs/*" @build/sources.txt
java -Dfile.encoding=UTF-8 -cp "build:libs/*" app.familymeal.solver.Main "$@"
