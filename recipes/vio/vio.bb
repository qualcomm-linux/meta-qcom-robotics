inherit robotics-qprebuilt-package

DESCRIPTION = "VIO"
LICENSE          = "Qualcomm-Technologies-Inc.-Proprietary"
LIC_FILES_CHKSUM = "file://${QCOM_COMMON_LICENSE_DIR}/${LICENSE};md5=58d50a3d36f27f1a1e6089308a49b403"

DEPENDS += "opencv curl adreno fastcv-binaries jpeg qrb-ros-camera qrb-ros-imu"

DEPENDS += "ament-cmake-auto-native ament-cmake-auto rclcpp sensor-msgs nav-msgs std-msgs"
DEPENDS += "geometry-msgs cv-bridge image-transport rclcpp-components rosidl-adapter rcutils"

SRC_URI = "https://artifacts.codelinaro.org/artifactory/qli-ci/software/chip/qualcomm_linux-spf-1-0/qualcomm-linux-spf-1-0_test_device_public/r1.0_00037.0/le-qcrobotics-1-0-r1/apps_proc/prebuilt_HY22/vio_1.0_armv8-2a.tar.gz"
SRC_URI[sha256sum] = "8151a2725ba585d49be531247444e39acfbe732567f79701913722d3795f2147"
