/*
 * Copyright 2000-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public enum CompilerMessageCategory {
    ERROR {
        public String toString() {
            return "ERROR";
        }
        @Override
        public String getPresentableText() {
            return toString();
        }
    },
    WARNING {
        public String toString() {
            return "WARNING";
        }
        @Override
        public String getPresentableText() {
            return toString();
        }
    },
    INFORMATION {
        public String toString() {
            return "INFORMATION";
        }
        @Override
        public String getPresentableText() {
            return toString();
        }
    },
    STATISTICS {
        public String toString() {
            return "STATISTICS";
        }
        @Override
        public String getPresentableText() {
            return toString();
        }
    };

    public abstract String getPresentableText();
}
