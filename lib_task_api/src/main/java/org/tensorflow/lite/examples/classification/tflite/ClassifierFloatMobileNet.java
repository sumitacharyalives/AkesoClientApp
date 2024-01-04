
package org.tensorflow.lite.examples.classification.tflite;

import android.app.Activity;
import java.io.IOException;
import org.tensorflow.lite.examples.classification.tflite.Classifier.Device;

/** This TensorFlowLite classifier works with the float MobileNet model. */
public class ClassifierFloatMobileNet extends Classifier {
  /**
   * Initializes a {@code ClassifierFloatMobileNet}.
   *
   * @param device a {@link Device} object to configure the hardware accelerator
   * @param numThreads the number of threads during the inference
   * @throws IOException if the model is not loaded correctly
   */
  public ClassifierFloatMobileNet(Activity activity, Device device, int numThreads)
      throws IOException {
    super(activity, device, numThreads);
  }

  @Override
  protected String getModelPath() {
    // you can download this file from
    // see build.gradle for where to obtain this file. It should be auto
    // downloaded into assets.
    return "mobilenet_v1_1.0_224.tflite";
  }
}
