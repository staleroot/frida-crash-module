```
import Java from "frida-java-bridge";

setTimeout(() => {
    console.log("hello")
    Java.perform(() => {
        console.log("does not get called")
    })
}, 2000)
```


```
2026-09-18 03:08:08.335 tchapp.play2048           com...app.play2048 Openjdkjvmti plugin was loaded on a non-debuggable Runtime. Plugin was loaded too late to change runtime state to support all capabilities. Only kArtTiVersion (0x70010200) environments are available. Some functionality might not work properly.
2026-09-18 03:08:08.521 tchapp.play2048           com...app.play2048 oat_file.cc:2535] Check failed: method_index < num_methods_ (method_index=275, num_methods_=42) /system/framework/arm64/boot-framework.oat
2026-09-18 03:08:08.662 tchapp.play2048           com...app.play2048 runtime.cc:714] Runtime aborting...
runtime.cc:714] Skipping all-threads dump as mutator lock is exclusively held.Aborting thread:
runtime.cc:714] "Thread-2" prio=5 tid=9 Native
runtime.cc:714]   | group="" sCount=0 ucsCount=0 flags=64 obj=0x0 self=0xb4000073cea6d3f0
runtime.cc:714]   | sysTid=17564 nice=0 cgrp=default sched=0/0 handle=0x72143fb2c0
runtime.cc:714]   | state=R schedstat=( 484357905 10645360 136 ) utm=20 stm=27 core=3 HZ=100
runtime.cc:714]   | stack=0x7214304000-0x7214306000 stackSize=988KB
runtime.cc:714]   | held mutexes= "abort lock" "Class loader classes"(shared held) "ClassLinker classes lock"(shared held) "mutator lock"(exclusive held)
runtime.cc:714]   native: #00 pc 00447800  /apex/com.android.art/lib64/libart.so (art::DumpNativeStack+112) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #01 pc 00541e5c  /apex/com.android.art/lib64/libart.so (art::Thread::DumpStack const+204) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #02 pc 00931838  /apex/com.android.art/lib64/libart.so (art::Thread::DumpStack const+104) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #03 pc 00925de8  /apex/com.android.art/lib64/libart.so (art::AbortState::DumpThread const+56) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #04 pc 0092206c  /apex/com.android.art/lib64/libart.so (art::Runtime::Abort+1084) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #05 pc 00014db0  /apex/com.android.art/lib64/libbase.so (android::base::SetAborter::$_0::__invoke+80) (BuildId: 01f56bead4468a24561430f970f06de2)
runtime.cc:714]   native: #06 pc 00014250  /apex/com.android.art/lib64/libbase.so (android::base::LogMessage::~LogMessage+544) (BuildId: 01f56bead4468a24561430f970f06de2)
runtime.cc:714]   native: #07 pc 005b1b18  /apex/com.android.art/lib64/libart.so (art::OatFile::OatClass::GetOatMethodOffsets const+1224) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #08 pc 0022ad68  /apex/com.android.art/lib64/libart.so (art::FindOatMethodFor +200) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #09 pc 0054fa44  /apex/com.android.art/lib64/libart.so (art::ArtMethod::GetOatMethodQuickCode+52) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #10 pc 007ff8cc  /apex/com.android.art/lib64/libart.so (art::instrumentation::Instrumentation::GetOptimizedCodeFor+76) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #11 pc 007ff76c  /apex/com.android.art/lib64/libart.so (art::instrumentation::Instrumentation::InstallStubsForMethod+300) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #12 pc 005c43bc  /apex/com.android.art/lib64/libart.so (art::instrumentation::Instrumentation::InstallStubsForClass+140) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #13 pc 0080223c  /apex/com.android.art/lib64/libart.so (art::instrumentation::InstallStubsClassVisitor::operator+12) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #14 pc 00612e5c  /apex/com.android.art/lib64/libart.so (bool art::ClassTable::Visit<0, art::VisitClassLoaderClassesVisitor::DefiningClassLoaderFilterVisitor>+204) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #15 pc 00612d70  /apex/com.android.art/lib64/libart.so (art::VisitClassLoaderClassesVisitor::Visit+112) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #16 pc 00396758  /apex/com.android.art/lib64/libart.so (art::ClassLinker::VisitClassLoaders const+104) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #17 pc 004b7514  /apex/com.android.art/lib64/libart.so (art::ClassLinker::VisitClassesInternal+1172) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #18 pc 004b6e9c  /apex/com.android.art/lib64/libart.so (art::ClassLinker::VisitClasses+124) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
2026-09-18 03:08:08.662 tchapp.play2048           com...app.play2048 runtime.cc:714]   native: #19 pc 007ffb8c  /apex/com.android.art/lib64/libart.so (art::instrumentation::Instrumentation::UpdateEntrypointsForDebuggable+60) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #20 pc 0002f560  /apex/com.android.art/lib64/libopenjdkjvmti.so (openjdkjvmti::DeoptManager::FinishSetup+336) (BuildId: fdfe1c687dfb83aeced7ca2a67feff78)
runtime.cc:714]   native: #21 pc 0004a3ec  /apex/com.android.art/lib64/libopenjdkjvmti.so (ArtPlugin_Initialize+252) (BuildId: fdfe1c687dfb83aeced7ca2a67feff78)
runtime.cc:714]   native: #22 pc 003fdd78  /apex/com.android.art/lib64/libart.so (art::Plugin::Load+104) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #23 pc 003fdb38  /apex/com.android.art/lib64/libart.so (art::Runtime::EnsurePluginLoaded+216) (BuildId: 40c660f95066cc11f492b0a0091a58ad)
runtime.cc:714]   native: #24 pc 00b0105c  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #25 pc 00b00b04  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #26 pc 009d2fd4  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #27 pc 009d2b98  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #28 pc 009d2af8  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #29 pc 00ba1534  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #30 pc 00ba3e58  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #31 pc 00ba3e58  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #32 pc 00ba4004  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #33 pc 00ba3e58  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #34 pc 00b9c550  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #35 pc 00b9ca50  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #36 pc 00ba1b98  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #37 pc 00ba3e58  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #38 pc 00ba3e58  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #39 pc 00ba4004  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #40 pc 00ba4004  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #41 pc 00ba4004  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #42 pc 00ba3e58  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #43 pc 00ba4004  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #44 pc 00ba4004  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #45 pc 00ba4004  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #46 pc 00ba133c  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #47 pc 00bb29a8  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #48 pc 00b9879c  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #49 pc 00ba1534  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #50 pc 00ba4004  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #51 pc 00ba133c  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #52 pc 009cf24c  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #53 pc 009cf328  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #54 pc 009cf978  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #55 pc 00b12e3c  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #56 pc 00b14c24  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #57 pc 00b14e48  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #58 pc 00b15000  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #59 pc 009c5bdc  /memfd:frida-agent-64.so (deleted) (???)
runtime.cc:714]   native: #60 pc 00b2814c  /memfd:frida-agent-64.so (deleted) (???)
2026-09-18 03:08:08.662 tchapp.play2048           com...app.play2048 runtime.cc:714]   native: #61 pc 000877dc  /apex/com.android.runtime/lib64/bionic/libc.so (__pthread_start +236) (BuildId: 30ed8d12b73f97af114ffd98e0d4f2e7)
runtime.cc:714]   native: #62 pc 000785c0  /apex/com.android.runtime/lib64/bionic/libc.so (__start_thread+64) (BuildId: 30ed8d12b73f97af114ffd98e0d4f2e7)
runtime.cc:714]   (no managed stack frames)
runtime.cc:714] 
```