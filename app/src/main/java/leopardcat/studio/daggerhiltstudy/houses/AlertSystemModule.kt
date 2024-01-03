package leopardcat.studio.daggerhiltstudy.houses

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named
import javax.inject.Qualifier

@Module
@InstallIn(ActivityComponent::class)
object AlertSystemModule {

    @Provides
//    @Named("noiseAlert") // 명시적으로 이름 지정하는 방법
    @Noise //함수 만들어서 처리하는 방법
    fun provideAlertSystem(): AlertSystem {
        return NoiseAlertSystem()
    }

    @Provides
//    @Named("lockAlert")
    @Lock
    fun provideLockAlertSystem(): AlertSystem {
        return LockAlertSystem()
    }
}

@Qualifier
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.FIELD
)
annotation class Lock

@Qualifier
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.FIELD
)
annotation class Noise