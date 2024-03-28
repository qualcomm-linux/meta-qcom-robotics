inherit qprebuilt robotics-package

LICENSE          = "Qualcomm-Technologies-Inc.-Proprietary"
LIC_FILES_CHKSUM = "file://${QCOM_COMMON_LICENSE_DIR}${LICENSE};md5=58d50a3d36f27f1a1e6089308a49b403"

DESCRIPTION = "Auto explore"

DEPENDS += "opencv curl adreno fastcv-binaries jpeg"
DEPENDS += "ament-cmake-native ament-cmake rclcpp sensor-msgs nav-msgs"
DEPENDS += "std-msgs geometry-msgs tf2 tf2-ros tf2-geometry-msgs"

SRCREV = "9fa4fc99f2c2c3de82c1d64d5d8e302a2c633108"

SRC_URI = "git://qpm-git.qualcomm.com/home2/git/qualcomm/qualcomm-linux-spf-1-0_test_device_roboapilnx.git;protocol=https;branch=master"

PREBUILT_TARBALL = "auto-explore_1.0_armv8-2a.tar.gz"

S = "${WORKDIR}/git/LE.QCROBOTICS.1.0.r1/apps_proc/prebuilt_HY22"

PACKAGES = "qirf-${PN}"